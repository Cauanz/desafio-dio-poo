import com.meu.desafio.Bootcamp;
import com.meu.desafio.Curso;
import com.meu.desafio.Dev;
import com.meu.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Curso introdutório de JAVA");
        curso1.setTitulo("Curso de JAVA");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(14);
        curso2.setDescricao("Curso introdutório de Python");
        curso2.setTitulo("Curso de Python");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria ingles");
        mentoria.setDescricao("Mentoria sobre ingles");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Bootcamp da linguagem JAVA");
        bootcamp.getConteudosBootcamp().add(curso1);
        bootcamp.getConteudosBootcamp().add(curso2);
        bootcamp.getConteudosBootcamp().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos João: " + devJoao.getConteudosFinalizados());
        System.out.println("XP de João:" + devJoao.calcularTotalXp());

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("Conteudos inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteudos concluidos Marcos: " + devMarcos.getConteudosFinalizados());
        System.out.println("XP de Marcos:" + devMarcos.calcularTotalXp());

    }
}