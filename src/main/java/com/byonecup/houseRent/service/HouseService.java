package com.byonecup.houseRent.service;

import com.byonecup.houseRent.domain.House;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/6 19:10
 * @Version 1.0
 */
public class HouseService {
    private House[] houses;
    private int houseNum = 1; // 记录当前有多少个房屋信息
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size]; // 当创建HouseService对象时指定数组大小
        // 初始化一个House对象测试列表信息
        houses[0] = new House(1, "jack", "13300000000", "江苏省南京市", 4000, "未出租");
    }

    // list方法，返回houses
    public House[] list() {
        return houses;
    }

    // 添加房屋
    public boolean add(House newHouse) {
        // 判断是否还可以继续添加（暂时不考虑数组扩容问题）
        if (houseNum == houses.length) {
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
        houses[houseNum++] = newHouse; // 这里把newHouse先放入到houses数组下标为houseNum的位置，houseNum再+1
        // 这里需要设计一个id自增长的机制
//        idCounter++;
        newHouse.setId(++idCounter);
        return true;
    }

    // 删除房屋
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }

    // 查找房屋
    public House findById(int findId) {
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
}
