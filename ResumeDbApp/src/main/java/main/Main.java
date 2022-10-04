package main;

import dao.impl.UserDaoImpl;
import dao.inter.UserDaoInter;
import entity.User;


public class Main {

    public static void main(String[] args) throws Exception {
//        EmploymentHistoryDaoInter employmentHistoryDao =Contextnew.intstanceEmploymentHistoryDao();
//        System.out.println(employmentHistoryDao.getAllEmploymentHistoryByUserId(6));
UserDaoInter userdao=Contextnew.intstanceUserDao();
//        User u=new User(9,"Niko","test","test","test","test",null,null,null);
//u.setPassword("12345");
//new UserDaoImpl().addUser(u);
System.out.println(userdao.getAll("Nihad", "Askerli", 1));
//CountryDaoInter countrydao=Contextnew.instanceCountryDao();
//        System.out.println(countrydao.getAll());
//SkillDaoInter skillDao=Contextnew.instanceSkillDao();
//        System.out.println(skillDao.insertSkill(new Skill( 20,"React")));
    }
//UserSkillDaoInter userSkillDaoInter=Contextnew.instanceUserSkillDao();
//

}
