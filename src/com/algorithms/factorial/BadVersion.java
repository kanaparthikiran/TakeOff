/**
 * 
 */
package com.algorithms.factorial;



/**
 * @author kkanaparthi
 *
 */
public class BadVersion extends VersionControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BadVersion badVersion = new BadVersion();
		int firstBadVersion = badVersion.firstBadVersion(10);
		int lastBadVersion = badVersion.lastBadVersion(10);
		System.out.println(" First Bad Version is " + firstBadVersion);
		System.out.println(" Last Bad Version is " + lastBadVersion);

	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public int firstBadVersion(int n) {
		int badVersion = 0;
		if (n > 0) {
			int start = 1;
			int end = n;
			while (start <= end) {
				int middle = start + (end - start)/2;
				if (isBadVersion(middle)) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}
			badVersion = start;
		}
		return badVersion;
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int lastBadVersion(int n) {
		int badVersion = 0;
		if (n > 0) {
			int start = 1;
			int end = n;
			while (start <= end) {
				int middle = start + (end - start)/2;
				if (isBadVersion(middle)) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			}
			badVersion = end;
		}
		return badVersion;
	}

}

class VersionControl {
	public boolean isBadVersion(int n) {
		if(n >= 4 && n<=8) {
			return true;
		} else {
			return false;
		}
	}

}