import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author SpidyBoy
 */
public class MovieList extends javax.swing.JFrame
{

    /**
     *
     */
    public  MovieList ()
    {
        initComponents ();
        ButtonGroup bg=new ButtonGroup();
        bg.add ( jRadioButton1 );
        bg.add ( jRadioButton2 );
        bg.add ( jRadioButton3 );
        bg.add ( jRadioButton4 );
        bg.add ( jRadioButton5 );
        bg.add ( jRadioButton6 );
    }
    
    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        search_for = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMDB Project By Spidy Boy");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(900, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Noman Nasir Minhas---------- (SP17-BSE-010)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 110, 430, 53);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IMDB Movie Project");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 60, 281, 53);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Abdul Wahab -------------------- (SP17-BSE-017)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 170, 430, 53);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Import Movies Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 230, 187, 52);

        search_btn.setBackground(new java.awt.Color(255, 255, 255));
        search_btn.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        search_btn.setForeground(new java.awt.Color(0, 153, 153));
        search_btn.setText("Search Data");
        search_btn.setEnabled(false);
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn);
        search_btn.setBounds(660, 380, 133, 33);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search By");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 330, 90, 31);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search For");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 380, 89, 31);

        search_for.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        search_for.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search_for.setEnabled(false);
        getContentPane().add(search_for);
        search_for.setBounds(250, 380, 361, 28);

        txt_area.setEditable(false);
        txt_area.setColumns(20);
        txt_area.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        txt_area.setRows(5);
        txt_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        txt_area.setEnabled(false);
        jScrollPane1.setViewportView(txt_area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 420, 727, 320);

        jRadioButton1.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Genre");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(310, 310, 75, 33);

        jRadioButton2.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Title");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(310, 340, 61, 33);

        jRadioButton3.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Year");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(450, 340, 63, 33);

        jRadioButton4.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Actor");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(450, 310, 67, 33);

        jRadioButton5.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Director");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(610, 340, 89, 33);

        jRadioButton6.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Rating Range");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(610, 310, 135, 33);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.JPG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-70, -100, 1965, 1200);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 10, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        try
        {
            importing();
            search_btn.setEnabled ( true);
            search_btn.setEnabled (true);
            search_for.setEnabled (true);
        }
        catch ( FileNotFoundException ex )
        {
            Logger.getLogger (MovieList.class.getName() ).log ( Level.SEVERE, null, "Error: File Not Found" );
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    String category="";
    private void search_btnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_search_btnActionPerformed
    {//GEN-HEADEREND:event_search_btnActionPerformed
        String query=search_for.getText ().toLowerCase ();
        search(category,query);
        txt_area.setEnabled ( true);
    }//GEN-LAST:event_search_btnActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton1ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton1ActionPerformed
            if(jRadioButton1.isSelected ())
            {
                category="genre";
            }
                
                
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton2ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected ())
        { 
            category="title";
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton3ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton3ActionPerformed
        if(jRadioButton3.isSelected ())
        {       
            category="year";
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton4ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton4ActionPerformed
        if(jRadioButton4.isSelected ())
        {       
            category="actor";
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton5ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton5ActionPerformed
        if(jRadioButton5.isSelected ())
        {   
            category="director";
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton6ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton6ActionPerformed
        if(jRadioButton6.isSelected ())
        {       
            category="rating range";
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    /**
     *
     */
    public class MovieTreeNode{

        
        public MovieNode data;
        MovieTreeNode left,right;

        /**
         *
         */
        public MovieTreeNode()
        {
            data = new MovieNode();
        }
    }   //Defines the composition of each Tree Node
    MovieTreeNode root=null;
    MovieTreeNode loc,ploc;
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main ( String args[] ) throws FileNotFoundException
    {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () )
            {
                if ( "Nimbus".equals ( info.getName () ) )
                {
                    javax.swing.UIManager.setLookAndFeel ( info.getClassName () );
                    break;
                }
            }
        }
        catch ( ClassNotFoundException ex )
        {
            java.util.logging.Logger.getLogger (MovieList.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
        }
        catch ( InstantiationException ex )
        {
            java.util.logging.Logger.getLogger (MovieList.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
        }
        catch ( IllegalAccessException ex )
        {
            java.util.logging.Logger.getLogger (MovieList.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
        }
        catch ( javax.swing.UnsupportedLookAndFeelException ex )
        {
            java.util.logging.Logger.getLogger (MovieList.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>
        //</editor-fold>
     //   MovieList obj=new MovieList();
     //   obj.importing ();
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater (() -> {
            new MovieList ().setVisible ( true );
        });
    }
    
    public void insertNode(MovieNode item)      //Inserts a new Node in Movie List
    {
        MovieTreeNode NN=new MovieTreeNode();
        NN.data=item;
        if(root==null)
            root=NN;
        else
        {
            loc=root;
            ploc=null;
            while(loc!=null)
            {
                if(NN.data.movie_title.compareTo(loc.data.movie_title)<=0)
                {
                    ploc=loc;
                    loc=loc.left;
                }
                else
                {
                    ploc=loc;
                    loc=loc.right;
                }
            }
            if(NN.data.movie_title.compareTo(ploc.data.movie_title)<=0)
            {   ploc.left=NN;
               
            }
            else
            {   ploc.right=NN;
              
            }
            
        }
    }
    String movie_list="";
    public void preorder(MovieTreeNode node)    //Prints all Movies in Pre Order
    {
       if(node==null)
           return;
       else
       {    
           preorder(node.left);
           preorder(node.right);
           if(node.data.title_year.contains("2012"))
            movie_list=movie_list+(node.data.movie_title)+"\n";
       }
       
    }
   
    public void importing() throws FileNotFoundException    //Imports data of Movies from CSV file
    {
        String fileName="src\\movies.csv";
        int item=0;
        StringTokenizer obj;
            MovieNode newNode;
            int entries = 0;
        File file=new File(fileName);
        try (Scanner input = new Scanner(file))
        {
            while(input.hasNext ())
            {   
                newNode=new MovieNode(); 
                String data=input.nextLine ();
                obj=new StringTokenizer(data, ",");
                entries=obj.countTokens ();
                if(entries==28 && obj.hasMoreTokens ())
                { 
                    for(int i=0;i<entries;i++)
                    {
                        switch ( i )
                        {
                            case 0:
                                
                                newNode.color=obj.nextToken ();
                             
                                break;
                            case 1:
                              
                                newNode.director_name=obj.nextToken ();
                            
                                break;
                            case 2:
                                
                                newNode.num_critic_for_reviews=obj.nextToken ();
                            
                                break;
                            case 3:
                            
                                newNode.duration=obj.nextToken ();
                                break;
                            case 4:
                            
                                newNode.director_facebook_likes=obj.nextToken ();
                                break;
                            case 5:
                            
                                newNode.actor_3_facebook_likes=obj.nextToken ();
                                break;
                            case 6:
                            
                                newNode.actor_2_name=obj.nextToken ();
                                break;
                            case 7:
                            
                                newNode.actor_1_facebook_likes=obj.nextToken ();
                                break;
                            case 8:
                            
                                newNode.gross=obj.nextToken ();
                                break;
                            case 9:
                            
                                newNode.genres=obj.nextToken();
                                break;
                            case 10:
                            
                                newNode.actor_1_name=obj.nextToken ();
                                break;
                            case 11:
                            
                                newNode.movie_title=obj.nextToken ();
                                break;
                            case 12:
                            
                                newNode.num_voted_users=obj.nextToken ();
                                break;
                            case 13:
                            
                                newNode.cast_total_facebook_likes=obj.nextToken ();
                                break;
                            case 14:
                            
                                newNode.actor_3_name=obj.nextToken ();
                                break;
                            case 15:
                            
                                newNode.facenumber_in_poster=obj.nextToken ();
                                break;
                            case 16:
                            
                                newNode.plot_keywords=obj.nextToken ().split (",");
                                break;
                            case 17:
                            
                                newNode.movie_imdb_link=obj.nextToken ();
                                break;
                            case 18:
                            
                                newNode.num_user_for_reviews=obj.nextToken ();
                                break;
                            case 19:
                            
                                newNode.language=obj.nextToken ();
                                break;
                            case 20:
                            
                                newNode.country=obj.nextToken ();
                                break;
                            case 21:
                            
                                newNode.content_rating=obj.nextToken ();
                                break;
                            case 22:
                            
                                newNode.budget=obj.nextToken ();
                                break;
                            case 23:
                            
                                newNode.title_year=obj.nextToken ();
                                break;
                            case 24:
                            
                                newNode.actor_2_facebook_likes=obj.nextToken ();
                                break;
                            case 25:
                            
                                newNode.imdb_score=obj.nextToken ();
                                break;
                            case 26:
                            
                                newNode.aspect_ratio=obj.nextToken ();
                                break;
                            case 27:
                            
                                newNode.movie_facebook_likes=obj.nextToken ();
                                break;
                            default:
                                JOptionPane.showMessageDialog ( rootPane, "Unknown Error: Data Not Imported" );
                                break;
                        }
                                   
                    }
                        insertNode(newNode);
                       insertDir (newNode);
                       insertActor ( newNode );
                }
                item++;
            }
            
            JOptionPane.showMessageDialog ( rootPane, "Data Imported Successfully for "+item+" Movies" );
        }
    }
    
    /**
     *
     * @param cat
     * @param key
     */
    
    public void search(String cat, String key)      // Searches a query as per its category
    {
        switch(cat)
        {
            case "genre":
                genre_movie_list="";
                genre_Search(root,key);
                txt_area.setText(genre_movie_list);
                break;
            case "title":
                title_movie_list="";
                title_Search(root,key);
                txt_area.setText(title_movie_list);
                break;
            case "year":
                year_movie_list="";
                year_Search(root,key);
                txt_area.setText(year_movie_list);
                break;
            case "actor":
                actor_movie_list="\n------------ List of all moviesof this actor with other cast---------\n";
                actor_ind_list="\n------------ List of all actors with this Actor---------\n";
                actor_Search(actor_root,key);
                txt_area.setText(actor_movie_list+actor_ind_list);
                break;
            case "director":
                dir_movie_list="";
                dir_Search(dir_root,key);
                txt_area.setText(dir_movie_list);
                break;
            case "rating range":
                rating_movie_list="";
                rating_Search(root,key);
                txt_area.setText(rating_movie_list);
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Search Error");
        }
        if(txt_area.getText()=="" || txt_area.getText()==null)
            JOptionPane.showMessageDialog(rootPane, "No Record Found");
    }
    String genre_movie_list="";
    public void genre_Search(MovieTreeNode node, String key)    //Searches movies of specified genre
    {   
        if(node==null)
           return;
       else
       {    
           genre_Search(node.left,key);
           genre_Search(node.right,key);
           if(node.data.genres.toUpperCase().contains(key.toUpperCase()))
                genre_movie_list=genre_movie_list+(node.data.movie_title)+"\n";
       }
    }
    
    String title_movie_list="";
    public void title_Search(MovieTreeNode node, String key)    // Searches data of a movie
    {
        if(node==null)
           return;
       else
       {    
           title_Search(node.left,key);
           title_Search(node.right,key);
           if(node.data.movie_title.toUpperCase().contains(key.toUpperCase()))
                title_movie_list=title_movie_list+"Movie Title="+(node.data.movie_title)+"\nActor 1 Name="+(node.data.actor_1_name)+"\nActor 2 Name="+(node.data.actor_2_name)+"\nActor 3 Name="+(node.data.actor_3_name)+"\n";
       }
    }
    
    String year_movie_list="";
    public void year_Search(MovieTreeNode node, String key)     // Searches movies with specified years
    {
        if(node==null)
           return;
       else
       {    
           year_Search(node.left,key);
           year_Search(node.right,key);
           if(node.data.title_year.contains(key))
                year_movie_list=year_movie_list+(node.data.movie_title)+"\n";
       }
    }
    
    String rating_movie_list="";
    public void rating_Search(MovieTreeNode node, String key)   //Searches Movies as per its content rating
    {
        if(node==null)
           return;
       else
       {    
           rating_Search(node.left,key);
           rating_Search(node.right,key);
           if(node.data.content_rating.toUpperCase().contains(key.toUpperCase()))
                rating_movie_list=rating_movie_list+(node.data.movie_title)+"\n";
       }
    }
    
    public class MovieNode                                      // Defines all fields of movie
{
    String color="";
    String director_name="";
    String num_critic_for_reviews="";
    String duration="";
    String director_facebook_likes="";
    String actor_3_facebook_likes="";
    String  actor_2_name="";
    String  actor_1_facebook_likes="";
    String  gross="";
    String  genres=""	;
    String  actor_1_name=""	;
    String  movie_title	="";
    String num_voted_users="";
    String cast_total_facebook_likes=""	;
    String actor_3_name	="";
    String facenumber_in_poster=""	;
    String[] plot_keywords=null;
    String movie_imdb_link=""	;
    String num_user_for_reviews=""	;
    String language="";
    String country="";
    String content_rating="";
    String budget="";
    String title_year=""	;
    String actor_2_facebook_likes="";
    String imdb_score="";
    String aspect_ratio=""	;
    String movie_facebook_likes="";

    }
    
    /**
     *
     */
    public class ActorNode{
        MovieNode data;
        ActorNode left;
        ActorNode right;
    }                       // Defines composition of Actor Node
    ActorNode actor_root=null; 
    ActorNode actor_loc;
    ActorNode actor_ploc;
    
    public void insertActor(MovieNode item)                 // Inserts Actor Node in Actor Tree
    {
        ActorNode NN=new ActorNode();
        NN.data=item;
        if(actor_root==null)
            actor_root=NN;
        else
        {
            actor_loc=actor_root;
            actor_ploc=null;
            while(actor_loc!=null)
            {
                if(NN.data.movie_title.compareTo(actor_loc.data.movie_title)<=0)
                {
                    actor_ploc=actor_loc;
                    actor_loc=actor_loc.left;
                }
                else
                {
                    actor_ploc=actor_loc;
                    actor_loc=actor_loc.right;
                }
            }
            if(NN.data.movie_title.compareTo(actor_ploc.data.movie_title)<=0)
            {   actor_ploc.left=NN;
               
            }
            else
            {   actor_ploc.right=NN;
              
            }
            
        }
    }
    
    String actor_movie_list="";
    String actor_ind_list="";
    public void actor_Search(ActorNode node, String key)    //Searched Actor in the Tree
    {
        if(node==null)
           return;
       else
       {    
           actor_Search(node.left,key);
           actor_Search(node.right,key);
           if(node.data.actor_1_name.toUpperCase().contains(key.toUpperCase()) ||
              node.data.actor_2_name.toUpperCase().contains(key.toUpperCase()) ||
              node.data.actor_3_name.toUpperCase().contains(key.toUpperCase()))
           {
               if(node.data.actor_3_name.toUpperCase().contains(key.toUpperCase()))
                actor_movie_list=actor_movie_list+(node.data.movie_title)+"\nOther Actors in this Movies:\n"+node.data.actor_1_name+"\n"+node.data.actor_2_name+"\n";
               if(node.data.actor_2_name.toUpperCase().contains(key.toUpperCase()))
                actor_movie_list=actor_movie_list+(node.data.movie_title)+"\nOther Actors in this Movies:\n"+node.data.actor_1_name+"\n"+node.data.actor_3_name+"\n";
               if(node.data.actor_1_name.toUpperCase().contains(key.toUpperCase()))
                actor_movie_list=actor_movie_list+(node.data.movie_title)+"\nOther Actors in this Movies:\n"+node.data.actor_2_name+"\n"+node.data.actor_3_name+"\n";
               if(node.data.actor_3_name.toUpperCase().contains(key.toUpperCase()))
                actor_ind_list=actor_ind_list+node.data.actor_1_name+"\n"+node.data.actor_2_name;
               if(node.data.actor_2_name.toUpperCase().contains(key.toUpperCase()))
                actor_ind_list=actor_ind_list+node.data.actor_1_name+"\n"+node.data.actor_3_name;
               if(node.data.actor_1_name.toUpperCase().contains(key.toUpperCase()))
                actor_ind_list=actor_ind_list+node.data.actor_3_name+"\n"+node.data.actor_2_name;
           }
       }
    }
    /**
     *
     */
    public class DirectorNode{
        MovieNode data;
        DirectorNode right,left;
    }           //Defines composition of DirectorNode
    DirectorNode dir_root=null; 
    DirectorNode dir_loc;
    DirectorNode dir_ploc;
    
    public void insertDir(MovieNode item)           //Inserts Director Node in Director Tree
    {
        DirectorNode NN=new DirectorNode();
        NN.data=item;
        if(dir_root==null)
            dir_root=NN;
        else
        {
            dir_loc=dir_root;
            dir_ploc=null;
            while(dir_loc!=null)
            {
                if(NN.data.movie_title.compareTo(dir_loc.data.movie_title)<=0)
                {
                    dir_ploc=dir_loc;
                    dir_loc=dir_loc.left;
                }
                else
                {
                    dir_ploc=dir_loc;
                    dir_loc=dir_loc.right;
                }
            }
            if(NN.data.movie_title.compareTo(dir_ploc.data.movie_title)<=0)
            {   dir_ploc.left=NN;
               
            }
            else
            {   dir_ploc.right=NN;
              
            }
            
        }
    }
    
    String dir_movie_list="";
    public void dir_Search(DirectorNode node, String key)   //Searches Director Node in Director Tree
    {
        if(node==null)
           return;
       else
       {    
           dir_Search(node.left,key);
           dir_Search(node.right,key);
           if(node.data.director_name.toUpperCase().contains(key.toUpperCase()))
                dir_movie_list=dir_movie_list+(node.data.movie_title)+"\n";
       }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_for;
    private javax.swing.JTextArea txt_area;
    // End of variables declaration//GEN-END:variables
}
