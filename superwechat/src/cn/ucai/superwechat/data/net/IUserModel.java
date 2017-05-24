package cn.ucai.superwechat.data.net;

import android.content.Context;

import java.io.File;

import cn.ucai.superwechat.data.OnCompleteListener;

/**
 * Created by clawpo on 2017/5/19.
 */

public interface IUserModel {
    void register(Context context, String username, String nickname, String password,
                  OnCompleteListener<String> listener);

    void unRegister(Context context, String username, OnCompleteListener<String> listener);

    void loadUserInfo(Context context,String username,OnCompleteListener<String> listener);

    void updateAvatar(Context context, String username, String avatarType,
                      File file, OnCompleteListener<String> listener);

    void updateNick(Context context,String username,String nickname,
                    OnCompleteListener<String> listener);
}
