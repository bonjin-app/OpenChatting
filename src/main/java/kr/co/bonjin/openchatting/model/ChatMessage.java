package kr.co.bonjin.openchatting.model;

public class ChatMessage {

    private MessageType type;   //타입
    private String content;     //내용
    private String sender;      //보낸사람

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
