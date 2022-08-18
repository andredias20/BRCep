import Interface.impl.apicep;
import Interface.impl.viacep;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(
                "Site: apicep.com :\n" +
                        brCep.searchCEP("85902215", new apicep()));

        System.out.println(
                "Site: viacep.com.br :\n" +
                        brCep.searchCEP("85900-180", new viacep()));
    }
}
