package com.example.proto.impl;

import com.example.proto.ProtoType;

import java.io.*;

/**
 * @author tiger
 * @date 2020/8/18
 */
public class ProtoTypeImpl implements ProtoType, Serializable {

    private String name;

    public ProtoTypeImpl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProtoTypeImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public ProtoType deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象取出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bi);
        return (ProtoTypeImpl) ois.readObject();
    }
}
