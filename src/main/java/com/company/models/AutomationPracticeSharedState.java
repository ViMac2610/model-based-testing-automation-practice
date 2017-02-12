// Generated by GraphWalker (http://www.graphwalker.org)
package com.company.models;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/company/models/AutomationPracticeSharedState.graphml")
public interface AutomationPracticeSharedState {

    @Edge()
    void e_SearchProducts();

    @Edge()
    void e_HomePage();

    @Vertex()
    void v_SearchProducts();

    @Edge()
    void e_StartBrowser();

    @Vertex()
    void v_HomePage();

    @Edge()
    void e_Cart();

    @Vertex()
    void v_Cart();
}
