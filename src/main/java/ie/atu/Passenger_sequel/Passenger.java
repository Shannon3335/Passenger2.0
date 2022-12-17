package ie.atu.Passenger_sequel;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class Passenger {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "count", nullable = false)
    private Long count;
    private String title;
    private String name;
    private long id;
    private long phone_no;
    private int age;


    public Passenger(String title, String name, long id, long phone_no, int age) {
        set_title(title);
        set_name(name);
        set_id(id);
        set_no(phone_no);
        set_age(age);

    }

    private void set_age(int age) {
        //Passenger must be 16 years or older
        if(age>16)
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Passenger must be over 16 to fly");
        }
    }

    private void set_no(long phone_no)
    {
        //phone number must be at least 7 digits long
        if(String.valueOf(phone_no).length() >= 7)
        {
            this.phone_no = phone_no;
        }
        else
        {
            throw new IllegalArgumentException("Phone number must be at least 7 digits long");
        }
    }

    private void set_id(long id) {
        //Passenger id must be atleast 10 digits long
        if (String.valueOf(id).length()>=10)
        {
            this.id = id;
        }
        else
        {
            throw new IllegalArgumentException("Id must be at least 10 digits long");
        }
    }

    private void set_name(String name) {
        //Passenger name must be at least 3 characters
        if (name.length()>=3)
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Name must be longer than 3 characters");
        }

    }

    public void set_title(String title)
    {
        //Passenger title can only be Mr, Ms or Mrs
        if ("Mr".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title))
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Title can only be Mr, Mrs or Ms");
        }

    }

    public String get_title() {
        return title;
    }

    public String get_name() {
        return name;
    }

    public long get_id() {
        return id;
    }

    public long get_phone_no() {
        return phone_no;
    }

    public int get_age() {
        return age;
    }


}
