package com.byonecup.houseRent.view;

import com.byonecup.houseRent.domain.House;
import com.byonecup.houseRent.service.HouseService;
import com.byonecup.houseRent.utils.Utility;

import java.util.Scanner;

/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    // 显示主菜单
    private boolean loop = true;
    private char key = ' ';

    public void mainMenu() {
        do {
            System.out.println("\n------------房屋出租系统------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择：");
            key = Utility.readChar();

            switch (key) {
                case '1':
                    System.out.println("当前选择：1 新增房源");
                    addHouse();
                    break;
                case '2':
                    System.out.println("当前选择：2 查找房屋");
                    findHouse();
                    break;
                case '3':
                    System.out.println("当前选择：3 删除房屋");
                    delHouse();
                    break;
                case '4':
                    System.out.println("当前选择：4 修改房屋信息");
                    updateHouse();
                    break;
                case '5':
                    System.out.println("当前选择：5 房屋列表");
                    listHouses();
                    break;
                case '6':
                    System.out.println("即将退出系统");
                    exit();
                    break;
            }
        } while (loop);
    }

    // 房屋列表
    private HouseService houseService = new HouseService(10);

    public void listHouses() {
        System.out.println("------------房屋列表------------");
        System.out.println("编号\t\t房主\t\t电话\t\t\t地址\t\t\t月租\t\t状态");
        House[] list = houseService.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                break;
            }
            System.out.println(list[i]);
        }
        System.out.println("------------显示完毕------------");
    }

    // 添加房屋
    public void addHouse() {
        System.out.println("------------添加房屋------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String addr = Utility.readString(20);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        // 创建一个新的House对象，注意id是系统分配，用户不能输入
        House house = new House(0, name, phone, addr, rent, state);
        if (houseService.add(house)) {
            System.out.println("------------添加完成------------");
        } else {
            System.out.println("------------××添加失败××------------");
        }
    }

    // 删除房屋
    public void delHouse() {
        System.out.println("------------删除房屋------------");
        System.out.print("请选择删除房屋编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("取消删除！");
            return;
        }
        System.out.print("确认是否删除（Y/N），请小心选择！");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("删除成功！");
            } else {
                System.out.println("编号不存在！");
            }
        } else {
            System.out.println("取消删除！");
        }
    }

    // 退出确认
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    // 根据id查找房屋信息
    public void findHouse() {
        System.out.println("------------查找房屋------------");
        System.out.print("请输入要查找的id：");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("房屋不存在！");
        }
    }

    // 根据id修改房屋信息
    public void updateHouse() {
        System.out.println("------------修改房屋信息------------");
        System.out.print("请输入待修改的房屋的id（-1：退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("取消修改！");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("房屋不存在！");
            return;
        }
        System.out.print("姓名（" + house.getName() + "）：");
        String name = Utility.readString(8, ""); // 如果直接回车表示不修改该信息
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.print("电话（" + house.getPhone() + "）：");
        String phone = Utility.readString(11, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("地址（" + house.getAddress() + "）：");
        String addr = Utility.readString(18, "");
        if (!"".equals(addr)) {
            house.setAddress(addr);
        }
        System.out.print("租金（" + house.getRent() + "）：");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("状态（" + house.getState() + "）：");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("修改完成！");
    }
}
