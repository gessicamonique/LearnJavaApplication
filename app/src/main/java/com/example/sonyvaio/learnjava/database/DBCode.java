package com.example.sonyvaio.learnjava.database;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony vaio on 26/04/2016.
 */
public class DBCode {

    public List<String> createTables(){

        List<String> tables = new ArrayList<>();

        tables.add("pergunta(id integer primary key autoincrement," +
                "texto varchar, tipo varchar)");

        tables.add("resposta (_id integer primary key autoincrement," +
                "texto varchar, status varchar, idPergunta integer," +
                "FOREIGN KEY (idPergunta) REFERENCES pergunta(id))");

        return tables;
    }

    public List<String> insertTables() {

        List<String> inserts = new ArrayList<>();

        inserts.add("pergunta (id, texto, tipo) VALUES (1,'String é um(a)__________','variaveis')");

        inserts.add("resposta (texto, status, idPergunta) VALUES ('Classe', 'true', 1)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Variável', 'false', 1)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Array', 'false', 1)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Tipo de dado', 'false', 1)");

        inserts.add("pergunta (id, texto, tipo) VALUES (2, 'Qual destes métodos da classe String pode ser usado para testar strings em comparações?','variaveis')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('isequal()', 'false', 2)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('isequals', 'false', 2)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('equal()', 'false', 2)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('equals()', 'true', 2)");

        inserts.add("pergunta (id, texto, tipo) VALUES (3, 'Se s=texto, qual é o valor retornado de s.length()?','variaveis')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('4', 'false', 3)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('5', 'true', 3)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('true', 'false', 3)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('false', 'false', 3)");


        inserts.add("pergunta (id, texto, tipo) VALUES (4, 'Qual destas palavras é usada para definir interfaces em Java?','oo')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('interface', 'true', 4)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Interface', 'false', 4)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('intf', 'false', 4)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Intf', 'false', 4)");

        inserts.add("pergunta (id, texto, tipo) VALUES (5, 'Qual desses especificadores de acesso pode ser utilizado para uma interface?','oo')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Public', 'true', 5)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Protected', 'false', 5)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('private', 'false', 5)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('Todas mencionadas', 'false', 5)");

        inserts.add("pergunta (id, texto, tipo) VALUES (6, 'Durante o desenvolvimento de uma aplicação orientada a objetos com Java, um técnico criou uma interface para obrigar um conjunto de classes de diferentes origens a implementar certos métodos de maneiras diferentes, viabilizando a obtenção de polimorfismo. A interface criada pelo técnico pode','oo')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('conter métodos implementados.', 'false', 6)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('ser instanciada diretamente.', 'false', 6)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('possuir um único construtor vazio.', 'false', 6)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('possuir métodos abstratos.', 'true', 6)");

        inserts.add("pergunta (id, texto, tipo) VALUES (7, 'Na linguagem Java, são modificadores para controle de acesso às variáveis e aos métodos de uma classe:','variaveis')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('public e private', 'true', 7)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('private e static', 'false', 7)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('static e public.', 'false', 7)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('protected e static.', 'false', 7)");

        inserts.add("pergunta (id, texto, tipo) VALUES (8, 'Em relação ao uso de arrays na linguagem Java, avalie as afirmativas a seguir: \n" +
                "\n" +
                "I - Um array é um grupo de variáveis que contém valores todos do mesmo tipo.\n" +
                "II - O primeiro elemento em cada array tem um índice um.\n" +
                "III - Um arraylist é semelhante a um array, mas pode ser dinamicamente redimensionado.','oo')");

        inserts.add("resposta (texto, status, idPergunta) VALUES ('I está correta.', 'false', 8)");
        inserts.add("resposta (texto, status, idPergunta) VALUES('I e III estão corretas. ','true',8)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('III está correta.', 'false', 8)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('I e II estão corretas.', 'false', 8)");;


        inserts.add("pergunta (id, texto, tipo) VALUES (9, 'Na linguagem Java, os tipos primitivos são:','variaveis')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('char, boolean, byte, short, int, long, float e double.', 'true', 9)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('char, integer, double e float.', 'false', 9)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('char, bool, int, byte, short, uint, long, float e double.', 'false', 9)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('char, int, longint, float e double.', 'false', 9)");

        inserts.add("pergunta (id, texto, tipo) VALUES (10, '','condicionais')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'true', 10)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 10)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 10)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 10)");

        inserts.add("pergunta (id, texto, tipo) VALUES (11, '','condicionais')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 11)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 11)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 11)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 11)");

        inserts.add("pergunta (id, texto, tipo) VALUES (12, '','condicionais')");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 12)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 12)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 12)");
        inserts.add("resposta (texto, status, idPergunta) VALUES ('', 'false', 12)");







        return inserts;

    }

    }
