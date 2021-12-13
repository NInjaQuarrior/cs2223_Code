package cs2223Assign4;

import java.util.ArrayList;
import java.util.Date;

public class Node {

	enum Continents {
		NORTH_AMERICA, SOUTH_AMERICA, EUROPE, AFRICA, ASIA, AUSTRIALIA, ANTARTICA
	};

	enum AccountType {
		PERSON, INSTITUTION
	};

	// datas
	double followersTotal;
	int tweetCount;
	int friends;
	int statuses;
	double listed;
	int favourites;
	int followersCount;

	// about
	String username;
	int id;
	String profileImage;

	// account info
	boolean influential;
	boolean og;
	Date created;
	int accountAge;

	String name;
	String shtName;

	double x;
	double y;

	String location;
	Continents continent;
	AccountType type;

	ArrayList<Link> edges;
	ArrayList<Node> neighbors;

	public Node() {

	}

	public Node(double followersTotal, int tweetCount, int friends, int statuses, double listed, int favourites,
			int followersCount, String username, int id, String profileImage, boolean influential, boolean og,
			Date created, int accountAge, String name, String shtName, double x, double y, String location,
			Continents continent, AccountType type) {

		this.followersTotal = followersTotal;
		this.tweetCount = tweetCount;
		this.friends = friends;
		this.statuses = statuses;
		this.listed = listed;
		this.favourites = favourites;
		this.followersCount = followersCount;
		this.username = username;
		this.id = id;
		this.profileImage = profileImage;
		this.influential = influential;
		this.og = og;
		this.created = created;
		this.accountAge = accountAge;
		this.name = name;
		this.shtName = shtName;
		this.x = x;
		this.y = y;
		this.location = location;
		this.continent = continent;
		this.type = type;
	}

	public double getFollowersTotal() {
		return followersTotal;
	}

	public void setFollowersTotal(double followersTotal) {
		this.followersTotal = followersTotal;
	}

	public int getTweetCount() {
		return tweetCount;
	}

	public void setTweetCount(int tweetCount) {
		this.tweetCount = tweetCount;
	}

	public int getFriends() {
		return friends;
	}

	public void setFriends(int friends) {
		this.friends = friends;
	}

	public int getStatuses() {
		return statuses;
	}

	public void setStatuses(int statuses) {
		this.statuses = statuses;
	}

	public double getListed() {
		return listed;
	}

	public void setListed(double listed) {
		this.listed = listed;
	}

	public int getFavourites() {
		return favourites;
	}

	public void setFavourites(int favourites) {
		this.favourites = favourites;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public boolean isInfluential() {
		return influential;
	}

	public void setInfluential(boolean influential) {
		this.influential = influential;
	}

	public boolean isOg() {
		return og;
	}

	public void setOg(boolean og) {
		this.og = og;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public int getAccountAge() {
		return accountAge;
	}

	public void setAccountAge(int accountAge) {
		this.accountAge = accountAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShtName() {
		return shtName;
	}

	public void setShtName(String shtName) {
		this.shtName = shtName;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Continents getContinent() {
		return continent;
	}

	public void setContinent(Continents continent) {
		this.continent = continent;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public ArrayList<Link> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Link> edges) {
		this.edges = edges;
	}

	public ArrayList<Node> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<Node> neighbors) {
		this.neighbors = neighbors;
	}

}
