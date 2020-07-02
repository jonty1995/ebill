package com.bt.EBill.repo.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class GroupCreateRepoImpl {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Object[]> getMappings() {
		Query query = entityManager.createNativeQuery("SELECT * from groupmapping");
		List<Object[]> res = query.getResultList();
		return res;
	}
}
