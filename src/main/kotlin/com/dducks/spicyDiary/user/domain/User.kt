package com.dducks.spicyDiary.user.domian

class User(id: String, pwd: String, name: String, nickname: String, phoneNum: String, picture: String){
    var id = id;
    var pwd = pwd;
    var name = name;
    var nickname = nickname;
    var phoneNum = phoneNum;
    var picture = picture;

    //CHECK: 비밀번호 hash하는 함수 등은 여기가 아니라 auth에 두는 것이 맞겠죠,,?
    
}