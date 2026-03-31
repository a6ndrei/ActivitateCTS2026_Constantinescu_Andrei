package fabrici;

import clase.PersonalSpital;

public interface PersonalFabrica {
    public PersonalSpital getPersonalSpital(TipPersonal tip,String nume,int ani);
}
