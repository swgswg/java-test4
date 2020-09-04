package com.login;

/**
 * 请定义一个登录接口的业务处理类，并编写一个login方法，来模拟处理如下登录异常情况：
 *      1001-用户名或密码为空
 *      1002-用户名不存在
 *      1003-密码错误
 *      1004-此帐号已锁定
 */
public class Login
{
    private String MyName = "admin";
    private String MyPwd = "123456";

    // 1开启/2禁用
    private int status = 2;

    public String name;
    public String pwd;

    public Login(String name, String pwd)
    {
        this.name = name.trim();
        this.pwd = pwd.trim();
    }

    public boolean login()
    {
            this.checkNamePwdEmpty();
            this.checkName();
            this.checkPwd();
            this.checkStatus();
            System.out.println("登录成功!");
            return true;
    }


    public boolean checkNamePwdEmpty()
    {

        if (this.name == null || this.name.length() <= 0 || this.pwd == null || this.pwd.length() <= 0) {
            throw new LoginException("用户名或密码为空");
        }
        return true;
    }


    public boolean checkName()
    {
        if (!this.name.equals(this.MyName)) {
            throw new LoginException("用户名不存在");
        }
        return true;
    }

    public boolean checkPwd()
    {
        if (!this.pwd.equals(this.MyPwd)) {
            throw new LoginException("密码错误");
        }
        return true;
    }

    public boolean checkStatus()
    {
        if(this.status == 2){
            throw new LoginException("此帐号已锁定");
        }
        return true;
    }

}
