package com.example.nguyenminhhieu_android43_day5_6;

public class LoginPresenter {
    ILongin iLongin;

    public LoginPresenter(ILongin iLongin) {
        this.iLongin = iLongin;
    }

    public void onLogin(String userName, String pass)
    {
        if(userName.equals("VietNam") && pass.equals("123456"))
            iLongin.onLoginsucsetfull("Login thành công!");
        else iLongin.onLoginErro("Login không thành công");


    }
}
