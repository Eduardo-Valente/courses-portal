package model.entities;

public class Student {

		private Integer uniqueID;

		public Student(Integer uniqueID) {
			
			this.uniqueID = uniqueID;
		}

		public Integer getUniqueID() {
			return uniqueID;
		}

		public void setUniqueID(Integer uniqueID) {
			this.uniqueID = uniqueID;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((uniqueID == null) ? 0 : uniqueID.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (uniqueID == null) {
				if (other.uniqueID != null)
					return false;
			} else if (!uniqueID.equals(other.uniqueID))
				return false;
			return true;
		}
}
