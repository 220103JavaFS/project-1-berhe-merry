package com.revature.repos;

import com.revature.models.Reimb;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAOImpl implements EmployeeDAO{

    /**
     * Method that will allow an employee to add a new request
     * this should set the time of the request and set the statusID to Pending as the default
     */
    @Override
    public Reimb addRequest(Reimb reimb) {
        try (Connection conn = ConnectionUtil.getConnection()) {

String sql="insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_description, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id )" +
        "values(1,(CAST ? AS INT),(SELECT CURRENT_TIMESTAMP),?,(CAST ? AS INT),(CAST ? AS INT),(CAST ? AS INT),(CAST ? AS INT)); ";
            PreparedStatement statement= conn.prepareStatement(sql);
            int count=0;
           // (CAST ? AS INT)
            statement.setString(++count, Double.toString(reimb.getAmount()));
            statement.setString(++count, reimb.getDescription());
           // statement.setString(++count, reimb.getReceipt());
            statement.setString(++count, Double.toString(reimb.getAuthor()));
            statement.setString(++count, Double.toString(reimb.getResolver()));
            statement.setString(++count, Double.toString(reimb.getStatusID()));
            statement.setString(++count, Double.toString(reimb.getTypeID()));
            statement.execute();
            return reimb;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
