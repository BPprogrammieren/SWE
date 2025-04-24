import java.util.List;

public class Developer {
    private int id;
    private String name;
    private String nickName;
    private List<String> programmingLanguages;
    private int yearsOfExperience;

    public Developer(String name, int id, String nickName,
                     List<String> programmingLanguages, int yearsOfExperience) {
        setName(name);
        setId(id);
        setNickName(nickName);
        setProgrammingLanguages(programmingLanguages);
        setYearsOfExperience(yearsOfExperience);
    }

    public void setId(int id) { //should be checked the validity value with,
        // for example with the list of existing id
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setProgrammingLanguages(List<String> programmingLanguages) {
        if (programmingLanguages == null || programmingLanguages.size() == 0) {
            throw new IllegalArgumentException("Programming languages cannot be empty");
        }
        this.programmingLanguages = programmingLanguages;
    }

}
