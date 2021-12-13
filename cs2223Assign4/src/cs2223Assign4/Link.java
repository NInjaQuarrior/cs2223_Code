package cs2223Assign4;

public class Link {

	int source;
	int target;
	int count;
	String id;

	enum LinkType {
		MENTION, RETWEET
	};

	LinkType type;

	public Link() {

	}

	public Link(int source, int target, int count, String id, LinkType type) {
		this.source = source;
		this.target = target;
		this.count = count;
		this.id = id;
		this.type = type;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LinkType getType() {
		return type;
	}

	public void setType(LinkType type) {
		this.type = type;
	}

}
