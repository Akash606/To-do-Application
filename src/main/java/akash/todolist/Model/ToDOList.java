package akash.todolist.Model;

import javax.persistence.*;

@Entity
public class ToDOList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Level  level;
    private  String detail;

    public ToDOList(String name, Level level, String detail) {
        this.name = name;
        this.level = level;
        this.detail = detail;
    }
    public ToDOList(){}

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        if( name==" "){
            return null;
        }else{
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
