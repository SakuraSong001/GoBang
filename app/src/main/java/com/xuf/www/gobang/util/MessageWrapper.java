package com.xuf.www.gobang.util;

import com.xuf.www.gobang.bean.Message;
import com.xuf.www.gobang.bean.Point;

/**
 * Created by lenov0 on 2016/1/25.
 */
public class MessageWrapper {

    public static Message getHostBeginMessage(boolean isWhite) {
        Message message = new Message();
        message.mMessageType = Message.MSG_TYPE_HOST_BEGIN;
        message.mIsWhite = isWhite;
        return message;
    }

    public static Message getHostBeginAckMessage() {
        Message message = new Message();
        message.mMessageType = Message.MSG_TYPE_BEGIN_ACK;
        return message;
    }

    public static Message getSendDataMessage(Point point) {
        Message message = new Message();
        message.mMessageType = Message.MSG_TYPE_GAME_DATA;
        message.mGameData = point;
        return message;
    }
}