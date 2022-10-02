//2)
public class Second {
    public static void main(String[] args) {
        Convertor c1 = new Convertor(new ConvertToJpeg("document"));
        c1.converting();
        c1 = new Convertor(new ConvertToPNG());
        c1.converting();
    }
}
interface IConvert{
    void convert();
}


class ConvertToJpeg implements IConvert{
    private String con;
    public ConvertToJpeg(String con){
        this.con = con;
    }
    @Override
    public void convert() {
        System.out.printf("Converting %s to Jpeg\n", this.con);
    }
}
class ConvertToPNG implements IConvert{

    @Override
    public void convert() {
        System.out.println("Converting to PNG");
    }
}
class ConvertToGif implements IConvert{

    @Override
    public void convert() {
        System.out.println("Converting to Gif");
    }
}



class Convertor {
    private IConvert convert;

    public Convertor(IConvert convert) {
        this.convert = convert;
    }
    public  void converting(){
        convert.convert();
    }
}