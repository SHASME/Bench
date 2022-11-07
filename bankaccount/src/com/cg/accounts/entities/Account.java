package com.cg.accounts.entities;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name ="student")
                @NamedQueries({@NamedQuery(name = "findall",query = "from Student"),
                @NamedQuery(name ="findById",
                query ="select std from Student std where std.slno=?1")})	
public class Account {

}
