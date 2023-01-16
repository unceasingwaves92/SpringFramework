package com.springboot.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContactDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveContact(Contact contact){
        String sql = "INSERT INTO contact (id, name, email_id, address, telephone) VALUES (task_id_seq.nextval, ?, ?, ?, ?)";
        int response = jdbcTemplate.update(sql, contact.getName(), contact.getEmail_id(), contact.getAddress(), contact.getTelephone());
        System.out.println("saved contact");
        return response;
    }

    public int updateContact(Contact contact){
        String sql = "UPDATE contact set email_id=? where id=?";
        int response = jdbcTemplate.update(sql,contact.getEmail_id(), contact.getId());
        System.out.println("update contact");
        return response;
    }

    public int deleteContact(Contact contact){
        String sql = "DELETE from contact where email_id=?";
        int response = jdbcTemplate.update(sql, contact.getEmail_id());
        System.out.println("delete contact");
        return response;
    }

    public List<Contact> getContacts(){
        String sql = "select * from contact";
        return  jdbcTemplate.query(sql, new ContactRowMapper());
    }

    public Contact getContactById(int id){
        String sql = "select * from contact where id=?";
        return  jdbcTemplate.queryForObject(sql, new ContactRowMapper(), id);
    }
}
