<<<<<<< HEAD
package com.evoting.domain;

import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Azhar on 2016/07/14.
 */

@Entity
@Audited
@Table(name="political_party")
public class PoliticalParty {
    private int id;
    private String partyId;
    private String password;
    private String partyName;
    private Set<Poll> polls = new HashSet<Poll>(0);
    private int nationalVoteCount = 0;
    private int provincialVoteCount = 0;
    private String blockchainNodeAddress;
    private String ipAddress;
    private String partyDescription;
    private String imgURL;

    public PoliticalParty() {
    }

    public PoliticalParty(int id, String partyName, int nationalVoteCount, int provincialVoteCount, String blockchainNodeAddress, String ipAddress) {
        this.id = id;
        this.partyName = partyName;
        this.nationalVoteCount = nationalVoteCount;
        this.provincialVoteCount = provincialVoteCount;
        this.blockchainNodeAddress = blockchainNodeAddress;
        this.ipAddress = ipAddress;
    }

    public PoliticalParty(String partyId, String password, String partyName, int nationalVoteCount, int provincialVoteCount, String blockchainNodeAddress, String ipAddress, String partyDescription, String imgURL)
    {
        this.partyId = partyId;
        this.password = password;
        this.partyName = partyName;
        this.nationalVoteCount = nationalVoteCount;
        this.provincialVoteCount = provincialVoteCount;
        this.blockchainNodeAddress = blockchainNodeAddress;
        this.ipAddress = ipAddress;
        this.partyDescription = partyDescription;
        this.imgURL = imgURL;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "party_idNum", nullable = false)
    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    @Column(name = "party_password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "party_name", unique = true, nullable = false)
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "political_party_poll",
            joinColumns = { @JoinColumn(name = "political_parties") },
            inverseJoinColumns = { @JoinColumn(name = "polls")} )
    public Set<Poll> getPolls() {
        return polls;
    }

    public void setPolls(Set<Poll> polls) {
        this.polls = polls;
    }

    @Column(name = "national_vote_count", nullable = false)
    public int getNationalVoteCount() {
        return nationalVoteCount;
    }

    public void setNationalVoteCount(int nationalVoteCount) {
        this.nationalVoteCount = nationalVoteCount;
    }

    @Column(name = "provincial_vote_count", nullable = false)
    public int getProvincialVoteCount() {
        return provincialVoteCount;
    }

    public void setProvincialVoteCount(int provincialVoteCount) {
        this.provincialVoteCount = provincialVoteCount;
    }

    @Column(name = "blockchain_node_address", nullable = false)
    public String getBlockchainNodeAddress() {
        return blockchainNodeAddress;
    }

    public void setBlockchainNodeAddress(String blockchainNodeAddress) {
        this.blockchainNodeAddress = blockchainNodeAddress;
    }

    @Column(name = "ip_address", nullable = false)
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Column(name="partyDescription", nullable = true)
    public String getPartyDescription() {
        return partyDescription;
    }

    public void setPartyDescription(String partyDescription) {
        this.partyDescription = partyDescription;
    }

    @Column(name="imgURL", nullable = true)
    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
=======
package com.evoting.domain;

import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Azhar on 2016/07/14.
 */

@Entity
@Audited
@Table(name="political_party")
public class PoliticalParty {
    private int id;
    private String partyName;
    private Set<Poll> polls = new HashSet<Poll>(0);
    private int nationalVoteCount = 0;
    private int provincialVoteCount = 0;
    private String blockchainNodeAddress;
    private String ipAddress;
    private String partyDescription;
    private String imgURL;





    public PoliticalParty() {
    }

    public PoliticalParty(int id, String partyName, int nationalVoteCount, int provincialVoteCount, String blockchainNodeAddress, String ipAddress) {
        this.id = id;
        this.partyName = partyName;
        this.nationalVoteCount = nationalVoteCount;
        this.provincialVoteCount = provincialVoteCount;
        this.blockchainNodeAddress = blockchainNodeAddress;
        this.ipAddress = ipAddress;
    }

    public PoliticalParty(String partyName, int nationalVoteCount, int provincialVoteCount, String blockchainNodeAddress, String ipAddress) {
        this.partyName = partyName;
        this.nationalVoteCount = nationalVoteCount;
        this.provincialVoteCount = provincialVoteCount;
        this.blockchainNodeAddress = blockchainNodeAddress;
        this.ipAddress = ipAddress;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "party_name", unique = true, nullable = false)
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "political_party_poll",
            joinColumns = { @JoinColumn(name = "political_parties") },
            inverseJoinColumns = { @JoinColumn(name = "polls")} )
    public Set<Poll> getPolls() {
        return polls;
    }

    public void setPolls(Set<Poll> polls) {
        this.polls = polls;
    }

    @Column(name = "national_vote_count", nullable = false)
    public int getNationalVoteCount() {
        return nationalVoteCount;
    }

    public void setNationalVoteCount(int nationalVoteCount) {
        this.nationalVoteCount = nationalVoteCount;
    }

    @Column(name = "provincial_vote_count", nullable = false)
    public int getProvincialVoteCount() {
        return provincialVoteCount;
    }

    public void setProvincialVoteCount(int provincialVoteCount) {
        this.provincialVoteCount = provincialVoteCount;
    }

    @Column(name = "blockchain_node_address", nullable = false)
    public String getBlockchainNodeAddress() {
        return blockchainNodeAddress;
    }

    public void setBlockchainNodeAddress(String blockchainNodeAddress) {
        this.blockchainNodeAddress = blockchainNodeAddress;
    }

    @Column(name = "ip_address", nullable = false)
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    @Column(name="partyDescription", nullable = true)
    public String getPartyDescription() {
        return partyDescription;
    }


    public void setPartyDescription(String partyDescription) {
        this.partyDescription = partyDescription;
    }


    @Column(name="imgURL", nullable = true)
    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }


}
>>>>>>> 11d375a55a3486846e81638e43bf34f75f42ce13
