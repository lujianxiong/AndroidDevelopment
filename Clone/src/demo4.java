import javax.rmi.PortableRemoteObject;
//深拷贝
public class demo4 {
    static class Body implements Cloneable{
        public Head head;
        public Body(){}
        public Body(Head head){
            this.head = head;
        }
        @Override
        protected Object clone()throws CloneNotSupportedException{
            Body newBody = (Body)super.clone();
            newBody.head = (Head)head.clone();
            return newBody;
        }
    }

    static class Head implements Cloneable{
        public Face face;
        public Head(){}
        public Head(Face face){
            this.face = face;
        }
        @Override
        protected Object clone()throws CloneNotSupportedException{
            Head newhead = (Head) super.clone();
            newhead.face = (Face) face.clone();
            return newhead;
        }
    }

    static class Face implements Cloneable{
        protected Object clone()throws  CloneNotSupportedException{
            return super.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Body body = new Body(new Head(new Face()));
        Body body1 = (Body)body.clone();
        System.out.println("body == body1: "+(body == body1));
        System.out.println("body.head == body1.head: "+(body.head == body1.head));
        System.out.println("body.head.face == body1.head.face: "+(body.head.face == body1.head.face));
    }
}
