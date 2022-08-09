package com.example.appdblibrary.service;


import com.example.appdblibrary.payload.ApiResult;

public interface FavouriteService {

    ApiResult<?> add(Long id);

    ApiResult<?> delete(Long id);

}
