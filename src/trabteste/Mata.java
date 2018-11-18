/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

/**
 *
 * @author Aluno
 */
public class Mata {
    // CONSTRUTOR 12.2
    public void Elim(String ja1,String ja2,String jb1,String jb2, int fa1, int fa2, int fb1, int fb2, String j){
        if (fa1>fa2){
            jb1 = ja1;
        }
        else {
            jb1 = ja2;
        }
        if (fb1>fb2){
            j = jb1;
        }
    }
       // CONSTRUTOR 6
    public void Elim(String ja1,String ja2,String jb1,String jb2, int fa1, int fa2, int fb1, int fb2,String jc1, String jc2, int fc1, int fc2, String j, int fa3, int fa4, String jb3, String jb4, String ja3, String ja4, int fb3, int fb4){
        if (fa1>fa2){
            jb1 = ja1;
        }
        else {
            jb1 = ja2;
        }
        if (fa3>fa4){
            jb3 = ja3;
        }
        else {
            jb3 = ja4;
        }
        
        if (fb1>fb2){
            jc1 = jb1;
        }
        else{
           jc1 = jb2;
        }
        if (fb3>fb4){
            jc2 = jb3;
        }
        else{
            jc2 = jb4;
        }
        if (fc1 > fc2){
            j = jc1;
        }
        else{
            j = jc2;
        }
            
        
    }
}
