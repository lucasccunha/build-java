package br.com.fiap;

import br.com.fiap.model.Produto;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Produto> produtos = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Produto.class).build().parse();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}