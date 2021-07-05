package br.com.aula4.tm.ecommerce.model.converter;

import br.com.aula4.tm.ecommerce.dto.CategoriaDTO;
import br.com.aula4.tm.ecommerce.form.CategoriaForm;
import br.com.aula4.tm.ecommerce.model.entity.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaConverter {
    public static Categoria categoriaFormToEntity(CategoriaForm categoriaForm) {
        return new Categoria(categoriaForm.getNome());
    }

    public static List<Categoria> categoriaFormToEntity(List<CategoriaForm> categoriaForms) {
        List<Categoria> categorias = new ArrayList<>();

        for (CategoriaForm categoriaForm : categoriaForms) {
            categorias.add(categoriaFormToEntity(categoriaForm));
        }

        return categorias;
    }

    public static CategoriaDTO categoriaEntityToDTO(Categoria categoria) {
        return new CategoriaDTO(categoria.getNome());
    }

    public static List<CategoriaDTO> categoriaEntityToDTO(List<Categoria> categorias) {
        List<CategoriaDTO> categoriaDTOS = new ArrayList<>();

        for (Categoria categoria : categorias) {
            categoriaDTOS.add(categoriaEntityToDTO(categoria));
        }

        return categoriaDTOS;
    }
}
