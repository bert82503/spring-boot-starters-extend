package com.spring.boot.observability.example.service;

import reactor.core.publisher.Mono;

import com.spring.boot.observability.example.model.UserModel;

/**
 * 用户服务
 *
 * @author guang.yi
 * @since 2023/12/16
 */
public interface UserService {

    /**
     * 通过身份获取用户
     *
     * @param id 身份
     * @return 实体
     */
    Mono<UserModel> getById(Long id);

}
