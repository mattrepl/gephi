/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2011 Gephi Consortium. All rights reserved.

The contents of this file are subject to the terms of either the GNU
General Public License Version 3 only ("GPL") or the Common
Development and Distribution License("CDDL") (collectively, the
"License"). You may not use this file except in compliance with the
License. You can obtain a copy of the License at
http://gephi.org/about/legal/license-notice/
or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
specific language governing permissions and limitations under the
License.  When distributing the software, include this License Header
Notice in each file and include the License files at
/cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
License Header, with the fields enclosed by brackets [] replaced by
your own identifying information:
"Portions Copyrighted [year] [name of copyright owner]"

If you wish your version of this file to be governed by only the CDDL
or only the GPL Version 3, indicate your decision by adding
"[Contributor] elects to include this software in this distribution
under the [CDDL or GPL Version 3] license." If you do not indicate a
single choice of license, a recipient has the option to distribute
your version of this file under either the CDDL, the GPL Version 3 or
to extend the choice of license to its licensees as provided above.
However, if you add GPL Version 3 code and therefore, elected the GPL
Version 3 license, then the option applies only if the new code is
made subject to such option by the copyright holder.

Contributor(s):

Portions Copyrighted 2011 Gephi Consortium.
*/
package org.gephi.ui.tools.plugin;

import java.awt.Color;
import org.gephi.ui.components.JColorButton;

/**
 *
 * @author Mathieu Bastian
 */
public class ShortestPathPanel extends javax.swing.JPanel {

    /** Creates new form ShortestPathPanel */
    public ShortestPathPanel() {
        initComponents();
    }

    public void setStatus(String status) {
        statusLabel.setText(status);
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public void setColor(Color color) {
        ((JColorButton) colorButton).setColor(color);
    }

    public Color getColor() {
        return ((JColorButton) colorButton).getColor();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        colorButton = new JColorButton(Color.BLACK);

        setPreferredSize(new java.awt.Dimension(400, 28));

        statusLabel.setFont(statusLabel.getFont().deriveFont((float)10));
        statusLabel.setText(org.openide.util.NbBundle.getMessage(ShortestPathPanel.class, "ShortestPathPanel.statusLabel.text")); // NOI18N

        resultLabel.setFont(resultLabel.getFont().deriveFont((float)10));
        resultLabel.setText(org.openide.util.NbBundle.getMessage(ShortestPathPanel.class, "ShortestPathPanel.resultLabel.text")); // NOI18N

        labelColor.setFont(labelColor.getFont().deriveFont((float)10));
        labelColor.setText(org.openide.util.NbBundle.getMessage(ShortestPathPanel.class, "ShortestPathPanel.labelColor.text")); // NOI18N

        colorButton.setText(org.openide.util.NbBundle.getMessage(ShortestPathPanel.class, "ShortestPathPanel.colorButton.text")); // NOI18N
        colorButton.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorButton;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}