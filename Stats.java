package com.vegasTracker;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author chris
 *
 */
/**
 * @author chris
 *
 */
@Entity
public class Stats {
	private Long id;
	private Date date;
	private String home;
	private String away;
	private String conference;
	private String spread;
	private String score;
	private String cover;
	
	protected Stats() {
		super();
	}
	
	/**
	 * @return Auto incremented ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
		
	}
	
	/**
	 * @return Date of the game
	 */
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return Home Team
	 */
	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	/**
	 * @return Away Team
	 */
	public String getAway() {
		return away;
	}

	public void setAway(String away) {
		this.away = away;
	}

	/**
	 * @return Conference played inf
	 */
	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	/**
	 * @return Point Spread for the game
	 */
	public String getSpread() {
		return spread;
	}

	public void setSpread(String spread) {
		this.spread = spread;
	}

	/**
	 * @return Final Score
	 */
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	/**
	 * @return Win/Loss for the game
	 */
	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	

}
