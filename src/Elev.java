public class Elev {

    private String namn;
    private int personnummer;
    private String email;
    private String mobilnummer;
    private String klass;
    private String program;


    public Elev(String namn, int personnummer, String email, String mobilnummer, String klass, String program) {
        this.namn = namn;
        this.personnummer = personnummer;
        this.email = email;
        this.mobilnummer = mobilnummer;
        this.klass = klass;
        this.program = program;
    }

    public void set_klass(String klass)
    {
        if(klass.trim().isEmpty())
        {
            throw new  IllegalArgumentException("Strängen klass var tom ");
        }
            

        this.klass=klass;
    }

    public String get_klass()
    {
        return this.klass;
    }

    public void skrivUtInfo() {
        System.out.println("Elevens namn: " + namn);
        System.out.println("Personnummer: " + personnummer);
        System.out.println("Email: " + email);
        System.out.println("Mobilnummer: " + mobilnummer);
        System.out.println("Klass: " + klass);
        System.out.println("Program: " + program);
    }
}
