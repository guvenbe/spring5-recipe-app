package guru.springframework.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Notes  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recepie;

    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecepie() {
        return recepie;
    }

    public void setRecepie(Recipe recepie) {
        this.recepie = recepie;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
