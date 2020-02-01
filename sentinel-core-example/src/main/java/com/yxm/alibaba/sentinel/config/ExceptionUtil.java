package com.yxm.alibaba.sentinel.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class ExceptionUtil  {
    public static String exHandler(BlockException ex) {
        return "exHandler error";
    }
}
