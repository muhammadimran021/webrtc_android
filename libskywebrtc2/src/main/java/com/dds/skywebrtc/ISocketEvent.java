package com.dds.skywebrtc;

/**
 * Created by dds on 2019/8/21.
 * android_shuai@163.com
 */
public interface ISocketEvent {

    // 创建房间
    void createRoom(String room, int roomSize);

    // 发送单人邀请
    void sendInvite(String userId, boolean audioOnly);

    // 发起会议邀请
    void sendMeetingInvite(String userList);

    // sendOffer
    void sendOffer(String userId, String sdp);

    // sendAnswer
    void sendAnswer(String userId, String sdp);

    // sendIceCandidate
    void sendIceCandidate(String userId, String id, String label, String candidate);

}
