/**
 * A classe MostradorNumero representa um mostrador de número digital que pode
 * armazenar valores de zero a um determinado limite. O limite pode ser
 * especificado durante a criação do mostrador. Os valores variam de zero
 * (inclusive) a limite - 1.
 *
 * Se usado, por exemplo, para os segundos em um relógio digital, o limite seria
 * 60, resultando na exibição de valores de 0 a 59.
 *
 * Quando incrementado, o mostrador muda automativamente para zero quando
 * alcançar o limite.
 *
 * Versão em português do livro Programação orientada a objetos com Java de
 * David J. Barnes and Michael Kolling
 *
 * @author Simone
 * @version 18/02/2021
 */
public class MostradorNumero {
    private int limite;
    private int valor;

    /**
     * Construtor cria um objeto que define o valor e o limite do mostrador digital.
     * 
     * @param limite limite do valor do mostrador digital
     */
    public MostradorNumero(int limite) {
        this.limite = limite;
        this.valor = 0;
    }

    /**
     * Retorna o valor atual.
     * 
     * @return o valor atual no mostrador
     */
    public int getValor() {
        return valor;
    }

    /**
     * Configura o valor do mostrador com o novo valor especificado. Se o novo valor
     * for menor que zero ou excedor o limite, não faz nada.
     * 
     * @param valor o valor a ser mostrado.
     */
    public void setValor(int valor) {
        if ((valor >= 0) && (valor < limite)) {
            this.valor = valor;
        }
    }

    /**
     * Retorna o valor do mostrador (String de dois dígitos, se o valor for menor do
     * que dez, ele será preenchido com um zero à esquerda.)
     */
    public String getMostradorValor() {
        if (valor < 10) {
            return "0" + valor;
        } else {
            return "" + valor;
        }
    }

    /**
     * Incrementa o valor do mostrador em 1 unidade, mudando para zero se o limite
     * for alcançado.
     */
    public void incrementar() {
        valor = (valor + 1) % limite;
    }
}
