package com.example.proto;

import com.example.proto.impl.ProtoTypeImpl;

import java.io.IOException;

/**
 * @author tiger
 * @date 2020/8/18
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProtoType protoType = new ProtoTypeImpl("hello world");

        ProtoType protoType1 = protoType.deepClone();

        System.out.println(protoType);
        System.out.println(protoType1);
    }
}
