/*
 * Copyright 2017 jfpal.com All right reserved. This software is the
 * confidential and proprietary information of jfpal.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with jfpal.com.
 
 Created by jun.ren on 2017/6/28.
 
 */
package Arrays;

import java.util.concurrent.ForkJoinPool;

/**
 * jdk源码中parallelSort并行排序阅读测试
 */
public class ArraysParallelSortTest {

    //并行排序任务的最小任务量
    private static final int MIN_ARRAY_SORT_GRAN = 1 << 13;

    //jdk1.8中添加并行排序
    public static void parallelSort(char[] a){
        //设置n大小为数组a的长度
        int n=a.length,p,g;
        if(n<=MIN_ARRAY_SORT_GRAN||
                (p= ForkJoinPool.getCommonPoolParallelism())==1)
            ;


    }

}
