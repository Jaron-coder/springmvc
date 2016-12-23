package com.cetc.utils;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

/**
 * 
 * @author hp
 *
 */
public class SolrUtils {

//	@Value("${solrBaseUrl}")
//	private static String BASEURL;
//	
	private static SolrServer solrServer;
	
	public synchronized static SolrServer getInstance(){
			if(solrServer==null){
				solrServer=new HttpSolrServer("http://10.111.10.212:8089/solr/");
			}
		return solrServer;
	}
	
	public static void main(String[] args) throws Exception {
	SolrServer server=getInstance();
	/*	SolrInputDocument doc=new SolrInputDocument();
		for(int i=0;i<4;i++){
			doc.setField("id","test_"+i);
			doc.setField("item_title","张三_"+i);
			server.add(doc);
		}
		server.commit();*/
	 SolrQuery q=new SolrQuery("张三");
	q.setRows(100);
	q.set("df","item_keywords");
	QueryResponse r=server.query(q);
	SolrDocumentList l=r.getResults();
	for (SolrDocument solrDocument : l) {
		System.out.println(solrDocument.get("id")+" "+solrDocument.get("item_title"));
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
