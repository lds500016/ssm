package org.com.dao;

import org.com.entities.agent;

public interface IAgentDao {
    public agent findAll();
    public agent Login(agent a);
    public int addAgent(agent a);
    public int updateAgent(agent a);
    public int delAgent(int id);
}
