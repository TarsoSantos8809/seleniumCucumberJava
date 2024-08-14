package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class cenarios {
    String dataEntregaText;

    @Dado("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() throws Throwable {

    }

    @Quando("executá-lo")
    public void executá_lo() throws Throwable {

    }

    @Então("a especificação deve finalizar com sucesso")
    public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {

    }

//****//
    //realizando modo de usar mesmo cenário com duas situações diferentes A.(\\d+)$") ou
    @Dado("que o ticket( especial)? é A.(\\d{3})$")
    public void queOTicketÉAF345(String especial, String valor) throws Throwable {

    }

    @Dado("que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void queOValorDaPassagemÉR$(int valor, int valor1) throws Throwable {

    }

    @Dado("que o nome do passageiro é \"(.{5,20})\"$")
    public void queONomeDoPassageiroÉ(String valor) throws Throwable {

    }

    //realizando modo de usar mesmo cenário com duas situações diferentes (\\d+)-(\\d+)$")  ou
    @Dado("que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void queOTelefoneDoPassageiroÉ(String telefone)  throws Throwable {

    }

    @Quando("criar os steps")
    public void criarOsSteps() throws Throwable {

    }

    @Então("o teste vai funcionar")
    public void oTesteVaiFuncionar() throws Throwable {

    }


}
