package com.example.grammar.forest

/**
 * Created by ouyangshen on 2017/8/18.
 */
sealed class SeasonSealed {
    //�ܷ����ڲ���ÿ��Ƕ���඼����̳и���
    class Spring (var name:String) : SeasonSealed()
    class Summer (var name:String) : SeasonSealed()
    class Autumn (var name:String) : SeasonSealed()
    class Winter (var name:String) : SeasonSealed()
}