package com.example.proto;

import java.io.IOException;

/**
 * @author tiger
 * @date 2020/8/18
 */
public interface ProtoType {

    /**
     * deepClone
     *
     * @return Object
     * @throws IOException            x
     * @throws ClassNotFoundException x
     */
    ProtoType deepClone() throws IOException, ClassNotFoundException;
}
