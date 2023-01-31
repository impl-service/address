package cn.subat.impl.address.service;


import cn.subat.impl.spdoc.annotation.SPDocConsumer;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;


@RabbitListener
public class AddressService {

    @SPDocConsumer(value = "获取地址",tag = "地址")
    @Queue("address.get.hello")
    public String getAddress() {
        return "address";
    }

}
