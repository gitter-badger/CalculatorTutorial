package Calculator.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InputFieldReference extends Expression {
  public static final String concept = "Calculator.structure.InputFieldReference";
  public static final String FIELD = "field";

  public InputFieldReference(SNode node) {
    super(node);
  }

  public InputField getField() {
    return (InputField) this.getReferent(InputField.class, InputFieldReference.FIELD);
  }

  public void setField(InputField node) {
    super.setReferent(InputFieldReference.FIELD, node);
  }

  public static InputFieldReference newInstance(SModel sm, boolean init) {
    return (InputFieldReference) SModelUtil_new.instantiateConceptDeclaration("Calculator.structure.InputFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputFieldReference newInstance(SModel sm) {
    return InputFieldReference.newInstance(sm, false);
  }
}
