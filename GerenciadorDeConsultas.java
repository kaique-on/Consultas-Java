import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeConsultas {
    //lista do tipo consultas
    private List<Consultas> consultar;

    //Construtor que ao ser chamado atribui um array a minha lista
    public GerenciadorDeConsultas() {
        consultar = new ArrayList<>();
    }

    //método para cadastrar uma consulta
    public void cadastrarConsulta(String paciente, String medico, String data) {
        Consultas consulta = new Consultas(paciente, medico, data);
        consultar.add(consulta);

    }

    //Listar consultas
    public void listarConsulta() {
        //Verifica se a lista está vazia
        if(consultar.isEmpty()){
            System.out.println("Não tem consultas");
        }else{
            //Percorre a lista e imprime cada item
            for(Consultas consultas : consultar){
                System.out.println(consultas);
            }
        }
    }

    //excluir consulta
    public void removerConsulta(int numero) {
        consultar.remove(numero);
    }

    

    public static void main(String[] args) {
        //cria o objeto gerenciador
        GerenciadorDeConsultas gerenciador = new GerenciadorDeConsultas();
        gerenciador.cadastrarConsulta("Kaian", "Luis Fernando", "02/11");
        gerenciador.cadastrarConsulta("Kaique", "Valadao", "18/05");
        gerenciador.removerConsulta(1);
        gerenciador.listarConsulta();
    }
}

/* duvidas: 
- Como diferenciar consultas consulta e consultar
- Qual a ordem dos acontecimentos
*/