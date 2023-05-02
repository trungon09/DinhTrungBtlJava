/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

import model.Dt;
import model.Gd;
import model.Ht;
import model.Tk;
import model.Ty;
import model.khoanChi;
import model.khoanThu;
import model.soDu;
//import com.mysql.cj.jdbc.Driver;

/**
 *
 * @author Than
 */
public class DAO {
    private static final int NULL = 0;
	private Connection conn;
    
    public DAO(){
        try {
        	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        	String url= "jdbc:mySQL://127.0.0.1:3306/thuChi_day?useSSL=false";
        	String username= "root";
        	String password= "";
       
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("ok");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
		
    }
    
    public boolean addKhoanThu(khoanThu kt){
        
        String sql = "INSERT INTO `thu`(`TT`,`Ngày`, `Mô tả`, `Số tiền`) "
                + "VALUES(?,?, ?,?);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, NULL);
            ps.setDate(2, new Date(kt.getDay().getTime()));
			ps.setString(3, kt.getMoTa());
			ps.setInt(4, kt.getSoTien());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       return false;
    }
    
    public ArrayList<khoanThu> getListKhoanThu(){
        ArrayList<khoanThu> list = new ArrayList<>();
        String sql = "SELECT * FROM thu;";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                khoanThu kt = new khoanThu();
                kt.setDay(rs.getDate("Ngày"));
                kt.setMoTa(rs.getString("Mô tả"));
                kt.setSoTien(rs.getInt("Số tiền"));
                list.add(kt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public boolean addKhoanChi(khoanChi kc){
        
        String sql = "INSERT INTO `chi`(`TT`, `Ngày`,`Mô tả`,`Mục đích`, `Số tiền`) "
                + "VALUES(?,?, ?,?, ?);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, NULL);
            ps.setDate(2, new Date(kc.getDay().getTime()));
            ps.setString(3, kc.getMoTa2());
            ps.setString(4, kc.getMucDich());
            ps.setInt(5, kc.getSoTien2());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       return false;
    }
    
    public ArrayList<khoanChi> getListKhoanChi(){
        ArrayList<khoanChi> list2 = new ArrayList<>();
        String sql = "SELECT * FROM chi;";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                khoanChi kc = new khoanChi();
                kc.setDay(rs.getDate("Ngày"));
                kc.setMoTa2(rs.getString("Mô tả"));
                kc.setSoTien2(rs.getInt("Số tiền"));
                kc.setMucDich(rs.getString("Mục đích"));
                list2.add(kc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list2;
    } 
    public void addTy(Ty ty) {
		String sql = "UPDATE thietyeu SET soTien=? WHERE stt=1;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ty.getSt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Ty> getListTy() {
		ArrayList<Ty> list = new ArrayList<>();
		String sql = "SELECT soTien FROM thietyeu;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Ty ty = new Ty();
				
				ty.setSt(rs.getInt("soTien"));
				list.add(ty);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}  
	public void addGd(Gd ty) {
		String sql = "UPDATE giaoduc SET soTien=? WHERE stt=1;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ty.getSt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Gd> getListGd() {
		ArrayList<Gd> list = new ArrayList<>();
		String sql = "SELECT soTien FROM giaoduc;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Gd Gd = new Gd();
				
				Gd.setSt(rs.getInt("soTien"));
				list.add(Gd);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}
	public void addHt(Ht ty) {
		String sql = "UPDATE huongthu SET soTien=? WHERE stt=1;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ty.getSt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Ht> getListHt() {
		ArrayList<Ht> list = new ArrayList<>();
		String sql = "SELECT soTien FROM huongthu;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Ht Ht = new Ht();
				
				Ht.setSt(rs.getInt("soTien"));
				list.add(Ht);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}
	public void addTk(Tk tk) {
		String sql = "UPDATE tietkiem SET soTien=? WHERE stt=1;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, tk.getSt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Tk> getListTk() {
		ArrayList<Tk> list = new ArrayList<>();
		String sql = "SELECT soTien FROM tietkiem;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Tk Gd = new Tk();
				
				Gd.setSt(rs.getInt("soTien"));
				list.add(Gd);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}
	public void addDt(Dt ty) {
		String sql = "UPDATE dautu SET soTien=? WHERE stt=1;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ty.getSt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Dt> getListDt() {
		ArrayList<Dt> list = new ArrayList<>();
		String sql = "SELECT soTien FROM dautu;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Dt Gd = new Dt();
				
				Gd.setSt(rs.getInt("soTien"));
				list.add(Gd);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}
	public void addSd(soDu ty) {
		String sql = "UPDATE sodu SET soTien=? WHERE stt=1;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ty.getSt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<soDu> getListSd() {
		ArrayList<soDu> list = new ArrayList<>();
		String sql = "SELECT soTien FROM sodu;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				soDu ty = new soDu();
				
				ty.setSt(rs.getInt("soTien"));
				list.add(ty);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}  
    public static void main(String[] args) {
        new DAO();
    }
}
