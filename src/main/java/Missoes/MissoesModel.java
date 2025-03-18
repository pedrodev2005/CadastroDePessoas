package Missoes;

import Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private boolean concluida;

    // uma missao para varias pessoas
    @OneToMany(mappedBy = "missoes")
    private List<PessoaModel> pessoa;
}
