/*
 * Copyright 2017 jfpal.com All right reserved. This software is the
 * confidential and proprietary information of jfpal.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with jfpal.com.
 
 Created by jun.ren on 2017/6/28.
 
 */

import java.util.concurrent.ForkJoinPool;

public class test {
    public static void main(String[] args){
        System.out.println(1<<16);
        System.out.println(ForkJoinPool.getCommonPoolParallelism());
    }
}
