package org.biojava3.structure.align.symm.protodomainsearch;

import org.biojava3.structure.align.symm.census2.Alignment;

public class SearchResultSignificanceFactory {

	public static SearchResultSignificance ultraLiberal() {
		return new SearchResultSignificance() {
			@Override
			public boolean isPossiblySignificant(Alignment alignment) {
				return true;
			}
			@Override
			public boolean isSignificant(Alignment alignment) {
				return true;
			}
		};
	}
	
}